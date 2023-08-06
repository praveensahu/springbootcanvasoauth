package com.canvas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canvas.component.WebClientComponent;
import com.canvas.dto.AccountDTO;
import com.canvas.model.Account;
import com.canvas.repository.AccountRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AccountService {
	@Autowired
	private WebClientComponent webclient;
	@Autowired
	private AccountRepository accountRepository;

	public List<AccountDTO> syncAccountDetails() throws Exception {
		List<AccountDTO> accountList = new ArrayList<AccountDTO>();
		accountList = new ObjectMapper().readValue(webclient.getApiResponse("/accounts"),new TypeReference<List<AccountDTO>>() {});
		List<Account> listOfEntity = accountList.stream().map(e -> new ModelMapper().map(e, Account.class)).collect(Collectors.toList());
		accountRepository.saveAll(listOfEntity);
		return accountList;
	}

}
