<#include "../../include/imports.ftl">

<#-- @ftlvariable name="document" type="org.example.beans.BoschBanner" -->
<div style="border: 1px dashed gray; padding: 1em;">
    <p>Bosch Banner Component / variant 1</p>
    <div>
        <h1>${document.getTitle()}</h1>
        <p class="date">
            <@fmt.formatDate value=document.getDate().time type="Date" pattern="dd.MM.yyyy" />
        </p>
    </div>
</div>