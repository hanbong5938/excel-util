package com.hanbong.excel.exception;

public class ExcelException extends RuntimeException {
  public ExcelException(String message, Throwable cause) {
    super(message, cause);
  }

  public ExcelException(String message) {
    super(message);
  }

  public ExcelException() {}
}
