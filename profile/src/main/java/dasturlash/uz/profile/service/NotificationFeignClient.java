package dasturlash.uz.profile.service;

import dasturlash.uz.profile.dto.transaction.NotificationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "notification")
public interface NotificationFeignClient {

    @GetMapping("/api/v1/notification/{phoneNumber}")
    public ResponseEntity<List<NotificationDTO>> getNotificationsByPhoneNumber(@RequestHeader("correlation-id") String correlationId,
                                                                               @PathVariable String phoneNumber);
}
