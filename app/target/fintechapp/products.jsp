<%
List<Product> list = (List<Product>)request.getAttribute("products");

if(list == null || list.size() == 0){
%>

<tr>
<td colspan="3">No products available</td>
</tr>

<%
} else {
for(Product p : list){
%>

<tr>
<td><%=p.getId()%></td>
<td><%=p.getName()%></td>
<td>₹ <%=p.getPrice()%></td>
</tr>

<%
}}
%>
