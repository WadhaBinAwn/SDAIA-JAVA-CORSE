package HomeWork.HW4;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
    private static final String URL = "jdbc:sqlite:D:\\Private\\SDAIA\\SDAIA Java Course\\JavaBasics\\src\\main\\java\\day4\\hr.db";
    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employees";
    private static final String SELECT_ONE_EMPLOYEE = "SELECT * FROM employees WHERE employee_id = ?";
    private static final String INSERT_EMPLOYEE = "INSERT INTO employees VALUES(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, manager_id, department_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_EMPLOYEE = "UPDATE employees SET first_name = ?, last_name = ?, email = ?, phone_number = ?, hire_date = ?, job_id = ?, salary = ?, manager_id = ?, department_id = ? WHERE employee_id = ?";
    private static final String DELETE_EMPLOYEE = "DELETE FROM employees WHERE employee_id = ?";

    public void insertEmployee(Employee employee) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement st = conn.prepareStatement(INSERT_EMPLOYEE)) {
            st.setInt(1, employee.getEmployeeId());
            st.setString(2, employee.getFirstName());
            st.setString(3, employee.getLastName());
            st.setString(4, employee.getEmail());
            st.setString(5, employee.getPhoneNumber());
            st.setDate(6, employee.getHireDate());
            st.setInt(7, employee.getJobId());
            st.setDouble(8, employee.getSalary());
            st.setInt(9, employee.getManagerId());
            st.setInt(10, employee.getDepartmentId());
            st.executeUpdate();
        }
    }

    public void updateEmployee(Employee employee) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement st = conn.prepareStatement(UPDATE_EMPLOYEE)) {
            st.setString(1, employee.getFirstName());
            st.setString(2, employee.getLastName());
            st.setString(3, employee.getEmail());
            st.setString(4, employee.getPhoneNumber());
            st.setDate(5, employee.getHireDate());
            st.setInt(6, employee.getJobId());
            st.setDouble(7, employee.getSalary());
            st.setInt(8, employee.getManagerId());
            st.setInt(9, employee.getDepartmentId());
            st.setInt(10, employee.getEmployeeId());
            st.executeUpdate();
        }
    }

    public void deleteEmployee(int employeeId) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement st = conn.prepareStatement(DELETE_EMPLOYEE)) {
            st.setInt(1, employeeId);
            st.executeUpdate();
        }
    }

    public Employee selectEmployee(int employeeId) throws Exception {
        Connection conn = DriverManager.getConnection(URL);
             PreparedStatement st = conn.prepareStatement(SELECT_ONE_EMPLOYEE);
            st.setInt(1, employeeId);
            ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Employee(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<Employee> selectAllEmployees() throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement st = conn.prepareStatement(SELECT_ALL_EMPLOYEES);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                employees.add(new Employee(rs));
            }
        }
        return employees;
    }
}

