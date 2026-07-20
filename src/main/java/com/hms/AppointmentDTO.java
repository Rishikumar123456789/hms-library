package com.hms;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppointmentDTO {
	 private Long appointmentId;
	 private  String patientName;
	 private  String doctorName;
	 private LocalDateTime appointmentDate;
	 private String status;
	 private  String remarks;
}
