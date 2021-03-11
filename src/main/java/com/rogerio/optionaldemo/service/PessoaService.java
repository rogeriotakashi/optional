package com.rogerio.optionaldemo.service;

import com.rogerio.optionaldemo.business.PessoaBusiness;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaBusiness pessoaBusiness;


}
