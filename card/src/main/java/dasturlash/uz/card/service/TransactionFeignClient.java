package dasturlash.uz.card.service;

import dasturlash.uz.card.dto.transaction.TransactionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "transaction")
public interface TransactionFeignClient {
    @GetMapping("/api/v1/transaction/card/{cardId}")
    public ResponseEntity<List<TransactionDTO>> getTransactionsByCardId(@PathVariable String cardId);
}
