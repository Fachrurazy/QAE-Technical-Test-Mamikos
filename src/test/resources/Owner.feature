Feature: Test Owner Create kost
  Scenario: As Owner Kost doing Created Kost
    Given Open browser Chrome
    And Open Website Mamikos
    And User doing Login
    And User choose Owner
    And Owner located on Login Pages
    When Owner Enter Phone Number "085781330814"
    When Owner Enter Password "Qwerty1234"
    And Owner located on Home Pages Owner Mamikos
    And Owner Owner open menu My Property
    And Owner choose Kost
    And Owner add Kost
    When Owner Enter Name Kost "Automation Test Technical"
    When Owner Enter Type Kost
    When Owner Enter Gender of Kost
    When Owner Enter Description Kost "This Kost Automation Test Technical"
    When Owner Enter Term&Condition Kost
    When Owner Enter When this Kost built?
    Then Owner do Next Steps Question Group
    Then Owner located on Address Pages
    When Owner Enter Address Location Maps
    When Owner Enter Provinsi
    When Owner Enter Kabupaten/Kota
    When Owner Enter Kecamatan
    When Owner Enter Noteds Address Detail
    Then Owner do Next Steps Question Group
    Then Owner located on Photo Kost
    When Owner Enter Photo Kost Tampak Depan
    When Owner Enter Photo Kost Tampak Belakang
    When Owner Enter Photo Kost from Road
    Then Owner do Next Steps Question Group
    Then Owner located on Photo Room Kost
    When Owner Enter Photo Room Kost Tampak Depan
    When Owner Enter Photo Room Kost Tampak Dalam
    When Owner Enter Photo Room Kost Bathroom
    Then Owner do Next Steps Question Group
    Then Owner located on Facility Kost
    When Owner Enter Public Facilities
    When Owner Enter Room Facilities
    When Owner Enter Bathroom Facilities
    Then Owner do Next Steps Question Group
    Then Owner located on Availability of Kost rooms
    When Owner Enter Size the Kost
    When Owner Enter Total Number Kost Room? "2"
    When Owner Enter How many room Kost? "2"
    Then Owner do Next Steps Question Group
    Then Owner located on Price Kost
    When Owner Enter Price the Kost "100000000"
    Then Owner Save The Kost