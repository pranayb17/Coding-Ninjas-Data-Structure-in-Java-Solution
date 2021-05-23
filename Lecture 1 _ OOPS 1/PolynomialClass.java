// Polynomial class
// Send Feedback
// Implement a polynomial class, that contains following functions -
// 1. setCoefficient -
// This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -
// Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -
// Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -
// Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -
// Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
// Print pattern for a single term : "x"
// And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
// Note : Only keep those terms which have non - zero coefficients.
// Sample Input 1 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 1 :
// P1 + P2 = 2x2 2x3 3x4 4x6
// Sample Input 2 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 2 :
// P1 - P2 = 2x3 -3x4 4x6


public class Polynomial {

	private int[] coeff;
	private int degree;

	public Polynomial() {
		coeff=new int[5];
		degree=-1;
	}
	public void setCoefficient(int degree,int coefficient) {
		if(degree >=coeff.length) {
			restructure(degree);
		}
		coeff[degree]=coefficient;
		if(degree >= this.degree) {
			this.degree=degree;
		}
	}
	public Polynomial add(Polynomial p) {

		Polynomial x=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			x.setCoefficient(k, p.coeff[i] + this.coeff[i]);
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			x.setCoefficient(k, p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			x.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return x;

	}
	public Polynomial subtract(Polynomial p) {

		Polynomial x=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			x.setCoefficient(k,  this.coeff[i] - p.coeff[i] );
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			x.setCoefficient(k, -p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			x.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return x;

	}
	public Polynomial multiply(Polynomial p) {

		Polynomial x=new Polynomial();

		for(int i=0;i<p.coeff.length;i++) {
			for(int j=0;j<this.coeff.length;j++) {
				if(i + j <=x.degree)
					x.setCoefficient( i + j ,x.coeff[i+j]+p.coeff[i] * this.coeff[j]);
				else
					x.setCoefficient(i + j ,p.coeff[i] * this.coeff[j]);
			}
		}
		return x;

	}
	public void print() {
		for(int i=0;i<coeff.length;i++) {
			if(coeff[i] !=0)
				System.out.print( coeff[i]  +"x"+ i +" ");
		}
	}
	private void restructure(int degree) {

		int[] temp=coeff;
		coeff=new int[degree + 1];
		for(int i=0;i<temp.length;i++) {
			coeff[i]=temp[i];
		}
	}




}

