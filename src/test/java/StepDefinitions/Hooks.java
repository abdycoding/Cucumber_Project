package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

    public class Hooks {   //Kanca

        @After
        public void after(Scenario senaryo) // Cucumberın ototmarik senaryo ile ilgili bilgiler değişkeni
        {
            GWD.quitDriver();
        }

    }
