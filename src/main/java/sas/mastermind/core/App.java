package sas.mastermind.core;

public class App {
    public static void main(String[] args) {
        System.out.println("Core dependency for multiplatform master mind.\n" +
                "import this package as a maven dependency and develop the specific\n" +
                "view tecnology.\n");
    }
    /*
    command to generate the maven dependency:
    mvn install:install-file -Dfile=/home/pacomorando/SpringBootProjects/multiplatform-master-mind/master-mind-core/target/master-mind-core-1.0.0.jar -DgroupId=sas.mastermind.core -DartifactId=master-mind-core -Dversion=1.0.0 -Dpackaging=jar
    */
}