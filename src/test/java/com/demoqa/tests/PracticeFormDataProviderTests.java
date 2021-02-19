package com.demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeFormDataProviderTests extends BaseTest {


        @DataProvider(name="TestPractiseForm")
        public Object [][]dataProvider(){
            return new Object[][] {
                    {"Nate", "Morava", "nate_morava_4@outlook.com",1,"1213456789","12 October,1995",0,"Keramidnica","NCR","Delhi"},
                    {"Emilija", "Liljanov","emi_lil@yahoo.com",0,"2314567890","03 January,2003",1,"Aerodrom","Rajasthan","Jaiselmer"},
                    {"Petar","Petrovski","p_petrovski@gmail.com",0,"1236549872","25 April,1994",2,"Zhelezara","Haryana","Karnal"},
                    {"Anja", "Janevska","j_anja@hotmail.com",1,"6549873210","09 August,2009",1,"Centar","NCR","Noida"}

            };
        }

        @Test(dataProvider = "TestPractiseForm")
        public void test(String name,String surname,String eMail,int gender, String phoneNumber,String date, int hobbies, String currentAddress, String state, String city){
            driver.navigate().to(URL5);
            practiceForm.name(name);
            practiceForm.surname(surname);
            practiceForm.eMail(eMail);
            practiceForm.gender(gender);
            practiceForm.mobileNumber(phoneNumber);
            practiceForm.dateOfBirth(date);
            practiceForm.hobbies(hobbies);
            practiceForm.currentAddress(currentAddress);
            practiceForm.state(state);
            practiceForm.city(city);
            practiceForm.submit();
            catc();

            Assert.assertEquals(practiceForm.studentName(), name+" "+surname);
            Assert.assertEquals(practiceForm.studentEmail(), eMail);
            Assert.assertEquals(practiceForm.studentMobile(), phoneNumber);
            Assert.assertEquals(practiceForm.studentDate(),date);
            Assert.assertEquals(practiceForm.studentAddress(), currentAddress);
            Assert.assertEquals(practiceForm.studentStateAndCity(), state+" "+city);
            catc();

        }



}


