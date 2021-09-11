package com.ecommerce.userservice.modal;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

@Entity
@Table(name = "users_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "first_name", nullable = false, length = 50)
    private String firstName;
	
    @Column (name = "last_name", nullable = false, length = 50)
    private String lastName;
    
    @Column (name = "email", nullable = false, unique = true, length = 50)
    private String email;
    
    @Column (name = "phone_number")
    private String phoneNumber;
    
    @NotBlank(message="{pancard.not.blank}")
	private String panCard;
	
	@NotBlank(message = "{aadhar.not.blank}")
	private String aadharCard;
	
	@NotBlank(message = "{address.not.blank}")
	private String address;
	
	@PastOrPresent
	private LocalDateTime createdTime;
}
