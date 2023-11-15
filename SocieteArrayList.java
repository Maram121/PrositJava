import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employee> {

    private ArrayList<Employee> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employee : employees) {
            if (employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        employees.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employees.sort((e1, e2) -> {
            int result = e1.getNom().compareTo(e2.getNom());
            if (result == 0) {
                result = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (result == 0) {
                    result = Integer.compare(e1.getGrade(), e2.getGrade());
                }
            }
            return result;
        });
    }
}