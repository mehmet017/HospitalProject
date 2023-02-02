package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Priorities {

    private int id;
    private String priorty;//Acil,poliklinik,rutin
    private List<Patients> patientsList=new ArrayList<>();

    public Priorities() {
    }

    public Priorities(int id, String priorty,List<Patients> patients) {
        this.id = id;
        this.priorty = priorty;
        this.patientsList=patients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriorty() {
        return priorty;
    }

    public void setPriorty(String priorty) {
        this.priorty = priorty;
    }

    public List<Patients> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patients> patientsList) {
        this.patientsList = patientsList;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", priorty='" + priorty + '\'' +
                ", patientsList=" + patientsList +
                '}';
    }
}
