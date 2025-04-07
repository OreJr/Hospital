/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author OreJr
 */
public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;


    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    
    public void addTeam(int TeamId, int ConsultantDoctorId) {
    }

    public void numberDoctorsPatient() {
        for(Team team : this.teams){
            for(Patient patient : team.getPatients){
                System.out.println("Patient " + patient.getId + "has" + patient.getDoctors.size() + "doctors" );
            }
            
        }
    }

    public void numberPatientsTeam() {
        for(Team team: this.teams){
            System.out.println("Team " +team.getID + " has " + team.getPatients.size() + "patients");
        }
        
    }
    

    public void relationAppoiments() {
        for(Ward ward: this.wards){
            for(Patient patient : ward.getPatients){
                System.out.println("Patient " + patient.getId + "has" + patient.getAppoiments.size() + "appoiments");
                if(patient.getAppoiments.size()>0){
                for(Appoiment appoiment : patient.getAppoiments){
                    System.out.println("Patient "+ patient.getId +" has an appoiment with the doctor " + appoiment.getDoctor.getId);
                }
                }
            }
        }
        
    } 
}
