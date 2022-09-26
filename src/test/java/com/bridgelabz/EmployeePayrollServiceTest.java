package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "Swapnil", 20000.0),
                new EmployeePayrollData(2, "Sahil", 40000.0),
                new EmployeePayrollData(3, "Shubham", 50000.0)
        };
        EmployeePayrollService employeePayRollService;
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayRollService.printData(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Employee payroll service entries are:" + entries);
    }
}