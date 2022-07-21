package com;

public class ValidCC {

	public void checkValidity(String ccNo) throws ValidCCException
		{
			if (ccNo.length()!=15)
			{
				throw new ValidCCException("Invalid CC No");
			}
			else
				System.out.println("Please make payment");
		}

	}

