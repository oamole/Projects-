/* A simple Date class
   Anderson, Franceschi
*/


public class Date
{
  private int month;
  private int day;
  private int year;

  /** default constructor
  *  sets month to 1, day to 1 and year to 2000
  */
  public Date( )
  {
    setDate( 1, 1, 2000 );
  }
/** non default constructor
* accepts month and year and assumes first day of month
*/

  /** overloaded constructor
  *  @param mm    initial value for month
  *  @param dd    initial value for day
  *  @param yyyy  initial value for year
  *
  *  passes parameters to setDate method
  */
  public Date( int mm, int dd, int yyyy )
  {
    setDate( mm, dd, yyyy );
  }
public Date( int NewMonth, int NewYear)
{
  month = NewMonth;
  year = NewYear;
  day =1;
}	
  /* accessor methods */
  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }

  /** mutator method */
  /** setMonth
  *  @param mm new value for month
  *  if mm is between 1 and 12, sets month to mm
  *  otherwise, sets month to 1
  */
  public void setMonth( int mm )
  {
    month = ( mm >= 1 && mm <= 12 ? mm : 1 );
  }

  /** setDay
  *  @param dd new value for day
  *  if dd is legal day for current month, sets day to dd
  *  otherwise, sets day to 1
  */
  public void setDay( int dd )
  {
    int [] validDays = { 0,  31, 29, 31, 30,
                         31, 30, 31, 31, 30,
                         31, 30, 31 };
    day = ( dd >= 1 && dd <= validDays[month] ? dd : 1 );
  }

  /** setYear
  *  @param yyyy new value for year
  *  sets year to yyyy
  */
  public void setYear( int yyyy )
  {
    year = yyyy;
  }

  /** setDate
  *  @param mm    new value for month
  *  @param dd    new value for day
  *  @param yyyy  new value for year
  *  passes parameters to setMonth, setDay, and setYear
  */
  public void setDate( int mm, int dd, int yyyy )
  {
    setYear(yyyy);
    setMonth( mm );
    setDay( dd );
  }

  /** toString
  *  @return String
  *  returns date in mm/dd/yyyy format
  */
  public String toString( )
  {
    return month + "/" + day + "/" + year;
  }

  /** equals
  *  @param   d  Date object to compare to this
  *  @return  true if d is equal to this
  *           false, otherwise
  */
  public boolean equals( Date d )
  {
    if ( month == d.month
         && day == d.day
         && year == d.year )
      return true;
    else
      return false;
  }
   public int daysLeftInMonth()
  {
	  int [] daysInMonth = { 0,  31, 29, 31, 30,
                             31, 30, 31, 31, 30,
	                         31, 30, 31 };
	  int validDays = daysInMonth[month];
	  int daysLeftInMonth = validDays - day;
	  return daysLeftInMonth;
  }
  
}
