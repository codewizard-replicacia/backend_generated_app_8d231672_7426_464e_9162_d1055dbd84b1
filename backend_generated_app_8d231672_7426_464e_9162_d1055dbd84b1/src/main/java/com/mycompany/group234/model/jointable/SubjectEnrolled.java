package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Student;
import com.mycompany.group234.model.Course;
import com.mycompany.group234.model.Subject;
import com.mycompany.group234.model.complex.Person;

@Entity(name = "SubjectEnrolled")
@Table(schema = "\"generated_app\"", name = "\"SubjectEnrolled\"")
@Data
public class SubjectEnrolled{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"StudentId\"")
	private Integer studentId;

    
    @Column(name = "\"CourseId\"")
    private Integer courseId;
 
}