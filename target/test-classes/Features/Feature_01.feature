Feature: FitPeo Revenue Calculator Functionality and Validating

  Scenario Outline: Adjust Slider, Update Text Field, and Verify CPT Codes and Reimbursement
    Given I navigate to the FitPeo Homepage
    And I navigate to Revenue Calculator Page
    When I scroll down till revenue calculator slider
    Then I adjust the slider to given value
    When I click text field and enter the given value "560"
    Then I check the slider with text box value
    When I scroll down to CPT codes section and change given value "820"
    And I select the checkboxes for "<CPT_1>", "<CPT_2>", "<CPT_3>", and "<CPT_4>"
    Then I compare Total Recurring Reimbursement with selected value

    Examples: 
      | CPT_1     | CPT_2     | CPT_3     | CPT_4     |
      | CPT-99091 | CPT-99453 | CPT-99454 | CPT-99474 |
