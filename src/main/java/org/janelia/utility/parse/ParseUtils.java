package org.janelia.utility.parse;

import com.beust.jcommander.IStringConverter;

public class ParseUtils
{

	/**
	 * Parses a string of the form "#,#,#,...#" and returns a double array
	 * 
	 * @param in
	 * @return
	 */
	public static double[] parseDoubleArray( String in )
	{
		String[] ina = in.split( "," );
		double[] out = new double[ ina.length ];

		for ( int i = 0; i < ina.length; i++ )
			out[ i ] = Double.parseDouble( ina[ i ] );

		return out;
	}

	/**
	 * Parses a string of the form "#,#,#,...#" and returns a float array
	 * 
	 * @param in
	 * @return
	 */
	public static float[] parseFloatArray( String in )
	{
		String[] ina = in.split( "," );
		float[] out = new float[ ina.length ];

		for ( int i = 0; i < ina.length; i++ )
			out[ i ] = Float.parseFloat( ina[ i ] );

		return out;
	}

	/**
	 * Parses a string of the form "#,#,#,...#" and returns an int array
	 * 
	 * @param in
	 * @return
	 */
	public static int[] parseIntArray( String in )
	{
		String[] ina = in.split( "," );
		int[] out = new int[ ina.length ];

		for ( int i = 0; i < ina.length; i++ )
			out[ i ] = Integer.parseInt( ina[ i ] );

		return out;
	}

	/**
	 * Parses a string of the form "#,#,#,...#" and returns an int array
	 * 
	 * @param in
	 * @return
	 */
	public static long[] parseLongArray( String in )
	{
		String[] ina = in.split( "," );
		long[] out = new long[ ina.length ];

		for ( int i = 0; i < ina.length; i++ )
			out[ i ] = Integer.parseInt( ina[ i ] );

		return out;
	}

	public static class DoubleArrayConverter implements IStringConverter< double[] >
	{
		@Override
		public double[] convert( String value )
		{
			return parseDoubleArray( value );
		}
	}

	public static class FloatArrayConverter implements IStringConverter< float[] >
	{
		@Override
		public float[] convert( String value )
		{
			return parseFloatArray( value );
		}
	}

	public static class IntArrayConverter implements IStringConverter< int[] >
	{
		@Override
		public int[] convert( String value )
		{
			return parseIntArray( value );
		}
	}

	public static class LongArrayConverter implements IStringConverter< long[] >
	{
		@Override
		public long[] convert( String value )
		{
			return parseLongArray( value );
		}
	}
}
