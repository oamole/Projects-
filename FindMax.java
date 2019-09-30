public class FindMax{


int index=-1;
int min= -100;
int [] intarray={4,2,5,6,7,8,-9,23,45,6,7,34,56};
for(int i=0; i<intarray.length; i++)
{
if(min>intarray[i]){
min=intarray[i];
index=i;
}
}
}
