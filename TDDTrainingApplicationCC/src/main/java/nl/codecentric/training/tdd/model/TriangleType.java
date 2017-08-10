package nl.codecentric.training.tdd.model;

/**
 * User: Hylke Stapersma
 * E-mail:[ hylke.stapersma@codecentric.nl]
 * Date: 23-12-12
 * Time: 12:40
 */
public enum TriangleType {
    EQUILATERAL,
    ISOSCELES,
    SCALENE;

    public String getName(){
        return name();
    }
    
    @Override
    public String toString() {
    	return name();
    }
}
