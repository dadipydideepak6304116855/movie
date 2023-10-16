package com.wipro.SearchMovie.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int candidateId;

    private String candidateName;
    private String candidateLocation;
    private int candidateExp;
    private String candidateEligibility;
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateLocation() {
		return candidateLocation;
	}
	public void setCandidateLocation(String candidateLocation) {
		this.candidateLocation = candidateLocation;
	}
	public int getCandidateExp() {
		return candidateExp;
	}
	public void setCandidateExp(int candidateExp) {
		this.candidateExp = candidateExp;
	}
	public String getCandidateEligibility() {
		return candidateEligibility;
	}
	public void setCandidateEligibility(String candidateEligibility) {
		this.candidateEligibility = candidateEligibility;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candidateId, String candidateName, String candidateLocation, int candidateExp,
			String candidateEligibility) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.candidateLocation = candidateLocation;
		this.candidateExp = candidateExp;
		this.candidateEligibility = candidateEligibility;
	}
    
    

}
