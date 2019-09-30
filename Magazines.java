package subclass;
import superclass.Record;
public class Magazines extends Record{
  private int IssueNum;
  private int VolumeNum;
  private String Editor;
  public Magazines(){
    super();
  }
  public Magazines(String title, String date, String edit,int issue_no,int volume_no)
  {
     super(title, date,author);
 this.Editor = edit;
     this.IssueNum  = issue_no;
     this.VolumeNum = volume_no;

  }
  public int getIssue_No()
  {
     return this.IssueNum;
  }
  public String getEditor()
  {
     return this.Editor;
  }

  public int getVolume_No()
  {
     return this.VolumeNum;
  }

  public void setIssue_No(int issue_no)
  {
     this.IssueNum = issue_no;
  }

  public void setVolume_No(int volume_no)
  {
     this.VolumeNum = volume_no;
  }
public void setEditor(String edit){
  this.Editor = edit;
}
  public String toString()
  {
     String str = "";

     str = str + super.toString();
     str = str + "Issue No. : " + this.getIssue_No() + "\n";
     str = str + "Volume No.: " + this.getVolume_No() + "\n";
      str = str + "Editor.: " + this.getEditor() + "\n";
     return str;
  }

  }
