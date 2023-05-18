package com.catalyst.interview;

//always sort in asc order based on firstName.
public class Employee implements  Comparable<Employee>{
        private String firstname;
        private String lastname;

        @Override
        public String toString() {
            return "Employee{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }

        public Employee(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

    @Override
    public int compareTo(Employee o) {
        return firstname.compareTo(o.getFirstname());
    }
}

