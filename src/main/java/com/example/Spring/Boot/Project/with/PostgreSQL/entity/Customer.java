package com.example.Spring.Boot.Project.with.PostgreSQL.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.processing.Pattern;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customers")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "customer_id")
   private long Id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String LastName;

   @Column(name = "middle_name")
   private String middleName;

   @Column(name = "email_address", unique = true)
   private String emailAddress;

   @Column(name = "phone_number")
   private String phoneNumber;

   private String gender;

   @Column(name = "birth_date")
   private LocalDate dateOfBirth;

   @Column(name = "registration_date")
   private LocalDate registrationDate;

   private String occupation;
}
