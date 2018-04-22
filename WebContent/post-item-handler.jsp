<jsp:useBean id="item" class="com.cakeshop.domain.Item" scope="request" />
<jsp:setProperty property="*" name="item" />
<jsp:forward page="items/" />