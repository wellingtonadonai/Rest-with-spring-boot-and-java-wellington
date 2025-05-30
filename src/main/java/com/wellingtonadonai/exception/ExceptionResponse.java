package com.wellingtonadonai.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String messang, String details) { }
