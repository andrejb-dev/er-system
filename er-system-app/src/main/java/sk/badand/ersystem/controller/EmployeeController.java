package sk.badand.ersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.badand.ersystem.domain.EmployeeRepository;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by abadinka on 28. 6. 2016.
 */
@RestController
public final class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Inject
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
