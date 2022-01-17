package com.precisely.employee.exception;

class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(int id) {
    super("Could not find employee " + id);
  }
}