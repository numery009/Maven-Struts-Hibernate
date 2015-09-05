package com.as.sample.constant;

public interface ValidationConstant {
	String EMAIL_ID_NULL = "EMailID Required<br>";
	public static final String EMAIL_ID_INVALID = "Invalid EMailId. for eg: a@b.c<br>";
	       String FIRST_NAME_LENGTH_MSG = "The First Name should be between 2 and 50 characters. Please Check and enter a valid First Name.</br>";
	        String FIRST_NAME_MUST_START_MSG = "First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name.</br>";
	  String FIRST_NAME_BLANK_MSG = "Please specify FirstName </br>";
	 //middle name validation msgs
	  String MIDDLE_NAME_BLANK_MSG = "Please specify MiddleName </br>";
	  String MIDDLE_NAME_LENGTH_MSG = "The Middle Name should be between 2 and 50 characters. Please Check and enter a valid Middle Name.</br>";
	  public static String MIDDLE_NAME_MUST_START_MSG = "Middle Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Middle Name.</br>";
	 //last name validation msgs
	  String LAST_NAME_BLANK_MSG = "Please specify LastName </br>";
    String LAST_NAME_LENGTH_MSG = "The Last Name should be between 2 and 50 characters. Please Check and enter a valid Last Name.</br>";
	  String LAST_NAME_MUST_START_MSG = "Last Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Last Name.</br>";
	 //gendar validation
	  String GENDAR_BLANK_MSG="Only Male or Female are Valid Values.</br>";
	  
	//Contact Information
	  //Address validation
	  String ADDRESS_BLANK_MSG="Please specify address</br>";
	  //City validation
	  String CITY_BLANK_MSG="Please specify city</br>";
	  String CITY_MATCH_MSG="City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.</br>";
	  String CITY_NAME_LENGTH_MSG="The City should be between 2 and 50 characters. Please Check and enter a valid City Name.</br>";
	  //state validation
	  String STATE_BLANK_MSG="State is required. Please select one from the list.</br>";
	  String STATE_NAME_LENGTH_MSG="The State should be between 2 and 50 characters. Please Check and enter a valid State Name.</br>";  
	  // country validation
	  String COUNTRY_BLANK_MSG="Country is required. Please select one from the list.</br>";
	 
	  //Phone Number validation
	  String PHONE_BLANK_MSG="Please specify valid Phone Nmuber.</br>";
	  String PHONE_NAME_LENGTH_MSG="Phone Number contains 10 digits. Please enter a valid Phone Number.</br>";
  //Bank Information
	  //BankName validation
	  String BANK_NAME_BLANK_MSG="Bank Name is required. Please select one from the list..</br>";
	  String BANK_NAME_LENGTH_MSG="The Bank Name should be less than 50 characters. Please Check and enter a valid Bank Name.</br>";
	  //account no validation
	  String BANK_ACC_BLANK_MSG="Bank Account Number is required. Please Enter Account Number</br>";
	  String BANK_ACC_LENGTH_MSG="Bank Account number contains 10 digits. Please enter a valid Business Number.</br>";
	  
	  //SSN validation
	  String SSN_BLANK_MSG="Please specify valid ssn Nmuber.</br>";
	  String SSn_LENGTH_MSG=" Number contains 9 digits. Please enter a valid ssn Number.</br>";

}
