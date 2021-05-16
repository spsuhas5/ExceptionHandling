package com.example.exceptionhandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

//@XmlRootElement(name = "employee")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVO /*extends ResourceSupport*/ implements Serializable
{
    private Integer employeeId;
    @NotEmpty(message = "first name must not be empty")
    private String firstName;
    @NotEmpty(message = "last name must not be empty")
    private String lastName;
    @NotEmpty(message = "email must not be empty")
    @Email(message = "email should be a valid email")
    private String email;

}
