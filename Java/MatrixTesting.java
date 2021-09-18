class Matrix
{
	int [][] mat;
	Matrix()
	{
		mat= new int[3][3];
	}
	
	Matrix(int[][] m)
	{
		int i=0,j;
		j=m.length;
		
		mat = new int[i][j];
		mat= m;
	}
	
	Matrix addMatrix(Matrix m1,Matrix m2)
	{
		Matrix add= new Matrix();
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				add.mat[i][j]=m1.mat[i][j] + m2.mat[i][j];
				}
			}
				return add;
	}
	
	Matrix subtractMatrix(Matrix m1,Matrix m2)
	{
		Matrix sub= new Matrix();
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				sub.mat[i][j]=m1.mat[i][j] - m2.mat[i][j];
				}
			}
				return sub;
	}
	
	Matrix transposeMatrix()
	{
		Matrix tp= new Matrix();
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				tp.mat[i][j]=mat[j][i];
				
				}
			}
				return tp;
	}
	
	void showMatrix()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(mat[i][j]+" ");
			}
		System.out.println("");
		}
	}
	
}

public class MatrixTesting
{
	public static void main(String arg[])
	{
		Matrix mt= new Matrix();
		
		int [][]m ={{1,2,3},{2,3,4},{4,5,6}};
		
		Matrix m1= new Matrix(m);
		mt.showMatrix();
		System.out.println("");
		m1.showMatrix();
		System.out.println("");
		
		int [][]mz= {{5,7,8},{3,6,2},{3,6,5}};
		Matrix m2= new Matrix(mz);
		m2.showMatrix();
		System.out.println("");

		Matrix adt= new Matrix();
		adt=mt.addMatrix(m1,m2);
		adt.showMatrix();
		System.out.println("");
		
		Matrix sbt= new Matrix();
		sbt=mt.subtractMatrix(m1,m2);
		sbt.showMatrix();		
		System.out.println("");
		
		Matrix tran= new Matrix();
		tran=m1.transposeMatrix();
		tran.showMatrix();			
		
		
		
		
		
	}
}

















