package com.project.bootcamp.services;

import com.project.bootcamp.exception.*;
import com.project.bootcamp.model.*;
import com.project.bootcamp.model.dto.*;
import com.project.bootcamp.repository.*;
import com.project.bootcamp.util.*;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        stockRepository.findByNameAndDate(dto.getName(), dto.getDate()).ifPresent(stock -> {throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);});

        Stock stock = modelMapper.map(dto, Stock.class);
        stockRepository.save(stock);
        dto.setId(stock.getId());
        return dto;
    }

    @Transactional
    public StockDTO update(StockDTO dto) {
        stockRepository.findByStockUpdate(dto.getId(), dto.getName(), dto.getDate()).ifPresent(stock -> {throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);});

        Stock stock = modelMapper.map(dto, Stock.class);
        stockRepository.save(stock);
        dto.setId(stock.getId());
        return dto;
    }

    @Transactional(readOnly = true)
    public List<StockDTO> findAll() {
        return stockRepository.findAll()
                .stream()
                .map(stock -> modelMapper.map(stock, StockDTO.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public StockDTO findById(Long id) {
        return stockRepository.findById(id).map(stock -> modelMapper.map(stock, StockDTO.class)).orElseThrow(NotFoundException::new);
    }

    @Transactional
    public StockDTO delete(Long id) {
        StockDTO stockDTO = this.findById(id);
        stockRepository.deleteById(stockDTO.getId());
        return  stockDTO;
    }

    @Transactional(readOnly = true)
    public List<StockDTO> findByToday() {
        return stockRepository.findByToday(LocalDate.now())
                .stream()
                .map(stock -> modelMapper.map(stock, StockDTO.class))
                .collect(Collectors.toList());
    }
}
