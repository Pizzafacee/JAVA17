package project03.conan.practice.team.exception;

import project03.conan.practice.team.service.EmployeeService;

public class TeamException extends RuntimeException {
    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
