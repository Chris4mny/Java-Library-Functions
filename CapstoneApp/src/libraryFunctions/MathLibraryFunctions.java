package libraryFunctions;

import javax.swing.JOptionPane;

public class MathLibraryFunctions
{
	public MathLibraryFunctions() // constructor
	{
		String pickAFunction;

		MathLibraryMessagesCenter("Welcome to the Math Library Functions Program"); // message method used throughout
																					// the program

		pickAFunction = menuForLibrary(); // allows user to choose a certain function from a menu

		pickAFunctionToUse(pickAFunction); // allows user to choose from one of the ten math functions
	}

	public void MathLibraryMessagesCenter(String theString) // input a message into the parameter as a String to use
	{
		JOptionPane.showMessageDialog(null, theString);
	}

	public void pickAFunctionToUse(String pickAFunction) // allows user to choose from one of the ten math functions
	{
		String useAgain;

		if (pickAFunction.equals("1")) // absolute value
		{
			int theNumber;
			int results;

			MathLibraryMessagesCenter("You selected ABSOLUTE VALUE");

			theNumber = inputANumber("Enter a positive or negative number\nto find its Absolute Value: ");

			results = absoluteValue(theNumber);

			dislpayTheResults("Absolute value results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("2")) // Average an Array
		{
			double results;
			int[] tstArray;

			MathLibraryMessagesCenter("You selected AVERAGE VALUE OF AN ARRAY\nEnter 5 numbers when prompted");

			tstArray = inputIntegersIntoAnArray();

			results = averageValueOfAnArray(tstArray);

			dislpayTheResults("Average value of the array results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("3")) // Integer Division
		{
			int numb1;
			int numb2;
			int results;

			MathLibraryMessagesCenter("You selected INTEGER DIVISION");

			numb1 = inputANumber("Enter the first number: ");

			numb2 = inputANumber("Enter the second number: ");

			results = integerDivision(numb1, numb2);

			dislpayTheResults("Integer division results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("4")) // Max value in an array
		{
			int[] tstArray;
			int results;

			MathLibraryMessagesCenter(
					"You selected MAX VALUE IN AN ARRAY\nPopulate an array of 5 numbers and the\nprogram will find the LARGEST number");

			tstArray = inputIntegersIntoAnArray();

			results = maxValueInArray(tstArray);

			dislpayTheResults("The largest number entered into the array is: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("5")) // Min value in an array
		{
			int[] tstArray;
			int results;

			MathLibraryMessagesCenter(
					"You selected MIN VALUE IN AN ARRAY\nPopulate an array of 5 numbers and the\nprogram will find the SMALLEST number");

			tstArray = inputIntegersIntoAnArray();

			results = minValueInArray(tstArray);

			dislpayTheResults("The smallest number entered into the array is: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("6")) // modulus
		{
			int numb1;
			int numb2;
			int results;

			MathLibraryMessagesCenter("You selected MODULUS");

			numb1 = inputANumber("Enter the first number: ");

			numb2 = inputANumber("Enter the second number: ");

			results = modulusRemainder(numb1, numb2);

			dislpayTheResults("Modulus results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("7")) // raise a number to a power
		{
			int numb1;
			int power;
			int results;

			MathLibraryMessagesCenter("You selected RAISE A NUMBER TO SOME POWER");

			numb1 = inputANumber("Enter the number: ");

			power = inputANumber("Enter the exponent: ");

			results = raiseNumberToSomePower(numb1, power);

			dislpayTheResults(numb1 + " Raised to the power of " + power + " results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("8")) // Rounding a number
		{
			double numb1;
			double results;

			MathLibraryMessagesCenter("You selected ROUNDING");

			numb1 = inputADouble("Enter a number with a decimal for it to be\nrounded to the nearest whole number: ");

			results = roundToNearestWholeNumber(numb1);

			dislpayTheResults("Rounded results are: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("9")) // Square a number
		{
			int numb1;
			int results;

			MathLibraryMessagesCenter("You selected SQUARE a number");

			numb1 = inputANumber("Enter a number to be squared: ");

			results = squaredNumber(numb1);

			dislpayTheResults("The number" + numb1 + " squared is: " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else if (pickAFunction.equals("10")) // Convert a string to an integer
		{
			int results;
			String tempInput = null;

			MathLibraryMessagesCenter("You selected CONVERT A STRING TO INTEGER");

			tempInput = obtainAString("Enter an Integer: ");

			results = convertStringToInt(tempInput);

			dislpayTheResults("String " + "\"" + tempInput + "\"" + " converted to integer " + results);

			useAgain = wouldYouLikeToUseAgain();

			runProgramAgain(useAgain);
		} else
		{
			MathLibraryMessagesCenter("Invalid Entry\nRun program again");

			System.exit(0);
		}

	}

	public void dislpayTheResults(String theMessage) // method for displaying results
	{
		JOptionPane.showMessageDialog(null, theMessage);
	}

	public String wouldYouLikeToUseAgain() // ask users if they want to continue/ provides user the option to continue
											// or quit
	{
		String useAgain;

		useAgain = JOptionPane.showInputDialog(
				"Would you like to use the program again?\nEnter the number 1 to continue\nEnter number 2 to quit");

		return useAgain;
	}

	public void runProgramAgain(String useAgain) // runs program again or exits based on user input
	{
		if (useAgain.equals("1"))
		{
			String pickAFunction;

			pickAFunction = menuForLibrary();

			pickAFunctionToUse(pickAFunction);
		}

		if (useAgain.equals("2"))
		{
			JOptionPane.showMessageDialog(null, "End of program");

			System.exit(0);
		}
	}

	public String obtainAString(String tempInput) // obtains a string to be utilized in a method
	{
		do
		{
			tempInput = JOptionPane.showInputDialog(tempInput);

		} while (!canBeInt(tempInput));

		return tempInput;
	}

	public String menuForLibrary() // menu for users to choose which method to perform (1-10)
	{
		String pickAFunction;

		pickAFunction = JOptionPane
				.showInputDialog("Enter the number of the function to use\n1 for \"Absolute Value\"\n2 for "
						+ "\"Average Value of an Array\"\n3 for \"Integer Division\"\n4 for \"Max Value in an Array\""
						+ "\n5 for \"Min Value in an Array\"\n6 for \"Modulus / Remainder\"\n7 for \"Raise a Number to Some Power\""
						+ "\n8 for \"Round\"\n9 for \"Square a number\"\n10 for \"Convert String to int\"");

		return pickAFunction;
	}

	public int absoluteValue(int theNumber) // returns the absolute value of a number
	{
		if (theNumber < 0)
		{
			return theNumber * -1;

		} else
		{
			return theNumber;
		}

	}

	public boolean canBeInt(String tempInput) // verifies can be an integer
	{
		int lookAtCharAt = 0;

		if (tempInput.charAt(0) == '+' || tempInput.charAt(0) == '-')
		{
			lookAtCharAt = 1;
		}

		for (; lookAtCharAt < tempInput.length(); lookAtCharAt++)
		{
			if (tempInput.charAt(lookAtCharAt) < '0' || tempInput.charAt(lookAtCharAt) > '9')
			{
				return false;
			}
		}

		return true;
	}

	public double averageValueOfAnArray(int[] tstArray) // takes total value of an array and gets the average of the
														// array
	{
		double total = 0;

		for (int i = 0; i < tstArray.length; i++)
		{
			total += tstArray[i];
		}

		double average = (total / tstArray.length);

//		System.out.println(total);

//		System.out.println(average);

		return average;
	}

	public int integerDivision(int numb1, int numb2) // performs integer division
	{
		checkDenominatorForZero(numb2);

		int result;

		result = (numb1 / numb2);

		return result;
	}

	public int maxValueInArray(int[] tstArray) // finds the largest value in the array by looping through index
	{
		int largest = 0;

		for (int n = 1; n < tstArray.length; n++)
		{
			if (tstArray[largest] < tstArray[n])
			{
				largest = n;
			}
		}

		return tstArray[largest];

	}

	public int minValueInArray(int[] tstArray) // finds the smallest value in the array by looping through index
	{
		int smallest = 0;

		for (int n = 1; n < tstArray.length; n++)
		{
			if (tstArray[smallest] > tstArray[n])
			{
				smallest = n;
			}
		}

		return tstArray[smallest];
	}

	public int modulusRemainder(int numb1, int numb2) // performs modulus division
	{
		checkDenominatorForZero(numb2);

		int result;

		result = (numb1 % numb2);

		return result;
	}

	public int raiseNumberToSomePower(int numb1, int power) // raises a number to a power of the users choice
	{
		int result = 1;

		for (int x = 0; x < power; x++)
		{
			result *= numb1;
		}

		return result;
	}

	public double roundToNearestWholeNumber(double numb1) // rounds to the nearest whole number
	{
		double tempDouble = (int) (numb1); // ex. if numb1 is (2.5) turns into a 2

		if ((numb1 - tempDouble) >= .5) // ex. 2.5 - 2 = 0.5 which is greater than or equal to .5
		{
			numb1 = (int) numb1 + 1; // if greater than or equal numb1 equals typecast int (2) of the double and adds
										// 1 making numb1 a (3)
		} else
		{
			numb1 = (int) (numb1); // if less than .5 it makes numb1 equal to the typecast of the double
		}

		return numb1;
	}

	public int squaredNumber(int numb1) // performs the square root of number entered
	{
		int result;

		result = (numb1 * numb1);

		return result;
	}

	public int convertStringToInt(String tempInput) // converts a string to an integer, doc wrote and I assisted
	{
		int stringLength = tempInput.length();
		double convertedInt = 0;
		double multiplier = Math.pow(10, stringLength - 1);

		for (int n = 0; n < tempInput.length(); n++)
		{
			int result = Character.getNumericValue(tempInput.charAt(n));

			convertedInt += result * multiplier;

			multiplier /= 10;

			System.out.println(convertedInt);
		}

		return (int) convertedInt;

	}

	public int inputANumber(String tempInput) // input a number and convert to an integer
	{
		String tempInputString;
		int theNumber;

		do
		{
			tempInputString = JOptionPane.showInputDialog(tempInput);

		} while (!canBeInt(tempInputString));

		theNumber = Integer.parseInt(tempInputString);

		return theNumber;
	}

	public int[] inputIntegersIntoAnArray() // inputs integers into an array to be used by other methods
	{
		int[] inputArray = null;
		String tempString;
		int elementSize = 5;

		inputArray = new int[elementSize];

		for (int n = 0; n < elementSize; n++)
		{
			canBeInt(tempString = JOptionPane.showInputDialog("Enter number " + (n + 1) + " into the array"));

			inputArray[n] = Integer.parseInt(tempString);
		}

		return inputArray;
	}

	public void checkDenominatorForZero(double numberTwo) // checks denominator for zero when dividing
	{
		if (numberTwo == 0)
		{
			JOptionPane.showMessageDialog(null, "Denominator cannot be zero\nTry again");

			System.exit(0);
		}
	}

	public double inputADouble(String theQuestion) // allows user to input a double
	{
		String tempInputString;
		double theNumber;

		do
		{
			tempInputString = JOptionPane.showInputDialog(theQuestion);

		} while (!canBeDouble(tempInputString));

		theNumber = Double.parseDouble(tempInputString);

		return theNumber;
	}

	public boolean canBeDouble(String temp) // Written by Doc in class// allows for a double to be input by the user
	{
		int lookAtCharAt = 0;
		boolean decimalPointFound = false;

		if (temp.charAt(0) == '+' || temp.charAt(0) == '-')
		{
			lookAtCharAt = 1;
		}

		for (; lookAtCharAt < temp.length(); lookAtCharAt++)
		{
			if (!decimalPointFound && temp.charAt(lookAtCharAt) == '.')
			{
				lookAtCharAt++;
				decimalPointFound = true;
			}

			if (temp.charAt(lookAtCharAt) < '0' || temp.charAt(lookAtCharAt) > '9')
			{
				return false;
			}
		}

		return true;
	}

}
