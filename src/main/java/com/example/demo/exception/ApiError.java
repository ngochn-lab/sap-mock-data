package com.example.demo.exception;

import java.time.OffsetDateTime;
import java.util.List;

public record ApiError(OffsetDateTime timestamp, int status, String error, List<String> messages, String path) {}
