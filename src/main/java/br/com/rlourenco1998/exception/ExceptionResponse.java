package br.com.rlourenco1998.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}