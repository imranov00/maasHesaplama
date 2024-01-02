public class Maas {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Maas(String name, double salary, int workhours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workhours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * (3.0 / 100);
        }
        return 0;
    }

    public double bonus() {
        if (this.workHours >= 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            return this.salary * (5.0 / 100);
        } else if ((2021 - this.hireYear) < 20 && (2021 - this.hireYear > 9)) {
            return this.salary * (10.0 / 100);
        } else {
            return this.salary * (15.0 / 100);
        }
    }

    public String sonuc() {
        return "Adı :" + this.name + "\n" + "Maaşı : " + this.salary + "\n" + "Çalışma Saati : " + this.workHours + "\n"
                + "Başlangıç Yılı : " + this.hireYear + "\n" + "Vergi : " + this.tax() + "\n" + "Bonus : "
                + this.bonus() + "\n" + "Maaş Artışı : " + this.raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş : "
                + ((this.salary + this.bonus()) - this.tax()) + "\n" + "Toplam Maaş : "
                + (((this.salary + this.bonus()) - this.tax()) + this.raiseSalary());
    }
}
