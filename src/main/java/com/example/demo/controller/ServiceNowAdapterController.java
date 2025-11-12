package com.example.demo.controller;

import com.example.demo.common.config.OffsetBasedPageRequest;
import com.example.demo.dto.EmployeeProfileDto;
import com.example.demo.dto.OnboardingCandidateInfoDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.ServiceNowAdapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service_now")
public class ServiceNowAdapterController {
    private final ServiceNowAdapterService serviceNowAdapterService;
    @Autowired
    public ServiceNowAdapterController(ServiceNowAdapterService serviceNowAdapterService) {
        this.serviceNowAdapterService = serviceNowAdapterService;
    }

    @GetMapping("/employee_profile/{id}")
    public ResponseEntity<ResponseDto> getEmployeeProfileById(@PathVariable Long id) {
        EmployeeProfileDto profile = serviceNowAdapterService.getEmployeeProfileById(id);

        if (profile != null) {
            return ResponseEntity.ok(new ResponseDto(profile));
        } else {
            ResponseDto response = new ResponseDto();
            response.setStatus(0);
            response.setCode(404);
            response.setMessage("Employee profile not found.");
            response.setData(null);
            return ResponseEntity.status(404).body(response);
        }
    }

    @GetMapping("/onboarding_candidate_info/{id}")
    public ResponseEntity<ResponseDto> getOnboardingCandidateInfoById(@PathVariable String id) {
        OnboardingCandidateInfoDto dto = serviceNowAdapterService.getOnboardingCandidateInfoById(id);

        if (dto != null) {
            return ResponseEntity.ok(new ResponseDto(dto));
        } else {
            ResponseDto response = new ResponseDto();
            response.setStatus(0);
            response.setCode(404);
            response.setMessage("Onboarding candidate info not found.");
            response.setData(null);
            return ResponseEntity.status(404).body(response);
        }
    }

    @GetMapping("/onboarding_candidate_info")
    public ResponseEntity<ResponseDto> getAllOnboardingCandidateInfo(
            @RequestParam(name = "skip", defaultValue = "0") int skip,
            @RequestParam(name = "limit", defaultValue = "10") int limit) {
        int lim = (limit <= 0) ? 10 : limit;
        long off = Math.max(0, skip);
        Pageable pageable = new OffsetBasedPageRequest(off, lim);

        Page<OnboardingCandidateInfoDto> dtoPage = serviceNowAdapterService.getAllOnboardingCandidateInfo(pageable);
        if (dtoPage.getContent().isEmpty()) {
            ResponseDto response = new ResponseDto();
            response.setStatus(1);
            response.setCode(404);
            response.setMessage("Empty onboarding candidate info list.");
            response.setData(null);
            return ResponseEntity.status(404).body(response);
        }
        ResponseDto response = new ResponseDto();
        response.setStatus(0);
        response.setCode(200);
        response.setMessage("Success");
        response.setData(dtoPage);
        return ResponseEntity.ok().body(response);
    }
}
