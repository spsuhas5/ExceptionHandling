package com.example.exceptionhandling.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "error")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse
{

    //General error message about nature of error
    private String message;

    //Specific errors in API request processing
    private List<String> details;

}