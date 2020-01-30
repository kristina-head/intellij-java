class Employee {
    protected String name;
    protected String email;
    protected int experience;

    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    protected String getName() {
        return this.name;
    }

    protected String getEmail() {
        return this.email;
    }

    protected int getExperience() {
        return this.experience;
    }
}

class Developer extends Employee {
    String mainLanguage;
    String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    protected String getMainLanguage() {
        return this.mainLanguage;
    }

    protected String[] getSkills() {
        return this.skills;
    }
}

class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    protected boolean isPhD() {
        return this.phd;
    }

    protected String[] getMethods() {
        return this.methods;
    }
}
