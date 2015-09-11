package algorithmsDAA;

import java .util.*;
class Graph
{
int g[][];
int v,e;
int d[],p[],visited[];
void creategraph()
{
int a,b,w;
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter no. of vertices");
v=s.nextInt();
System.out.println("Enter no. of edges");
e=s.nextInt();
g=new int [v+1][v+1];
for(int i=1;i<=v;i++)
for(int j=1;j<=v;j++)
g[i][j]=0;
for(int i=1;i<=e;i++)
{
System.out.println("Enter edge information");
a=s.nextInt();
b=s.nextInt();
System.out.println("Enter the wt of this edge");
w=s.nextInt();
g[a][b]=g[b][a]=w;
}
}
void callprim()
{
visited=new int[v+1];
d=new int[v+1];
p=new int[v+1];
for(int i=1;i<=v;i++)
p[i]=visited[i]=0;
for(int i=1;i<=v;i++)
d[i]=32767;
prim();
}
void prim()
{
int c,current,mincost=0;
current=1;
visited[current]=1;
d[current]=0;
c=1;
while(c!=v)
{
for(int i=1;i<=v;i++)
{
if(g[current][i]!=0 && visited[i]!=1)
if(g[current][i]<d[i])
{
d[i]=g[current][i];
p[i]=current;
}
}
int min=32767;
for(int i=1;i<=v;i++)
{
if(visited[i]!=1 && d[i]<min)
{
min=d[i];
current=i;
}
}
visited[current]=1;
c=c+1;
}
for(int i=1;i<=v;i++)
mincost+=d[i];
System.out.println("minimum cost= "+mincost);
}
}
public class prims
{
public static void main(String args[])
{
Graph g=new Graph();
g.creategraph();
g.callprim();
}
}