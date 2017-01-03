package ntou.cs.sorter;;

public class MySorter
{
	
	public double[] sort (double[] d)
	{
		int negati = 0;
		for (int i = 0; i < d.length; i++)
		{
			if(d[i] < 0 ){
				negati = 1;
			}
		}
		if(negati != 1){
			if(d.length != 0){
				for (int i = 0; i < d.length - 1; i++)
				{
					for (int j = 0; j < d.length - i - 1; j++)
					{
						if (d[j] > d[j + 1])
						{
							swap(d, j, j + 1);
						}
					}
				}
			}
		}
		return (d);
	}

	public void swap (double d[], int k, int s)
	{
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}
