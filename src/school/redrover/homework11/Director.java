package school.redrover.homework11;

//Коэффициенты для расчета ЗП у Manager и Director
//должны быть константами (коэффициенты из формулы расчета ЗП)
//Классы Manager и Director должны быть финальными
public final class Director extends Employee {

    private final double salaryCoeff = 0.09;

    @Override
    protected double getSalary() {
        return super.getBaseSalary() * (1 + super.getNumberOfSubordinates() * salaryCoeff);
    }
}
