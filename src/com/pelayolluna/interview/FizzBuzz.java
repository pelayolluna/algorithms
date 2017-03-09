/*
 * Copyright 2016 Pelayo José Lluna González.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Typical programming interview problem
 * 
 * "Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz"
 * 
 */
 
 /**
 *
 * @author Pelayo José Lluna González
 */
public class FizzBuzz {

	public static void main() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
