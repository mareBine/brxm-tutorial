<#include "../include/imports.ftl">

<#-- @ftlvariable name="document" type="org.example.beans.BoschBanner" -->
<#-- @ftlvariable name="info" type="org.example.components.BoschBannerComponentInfo" -->
<div style="border: 1px dashed gray; padding: 1em;">
    <p>Bosch Banner Component</p>
    <div>
        <h1>${document.getTitle()}</h1>
        <p class="date">
            <@fmt.formatDate value=document.getDate().time type="Date" pattern="dd.MM.yyyy" />
        </p>
        <p class="pageSize">documentPath: ${info.getDocument()}</p>
        <p class="pageSize">city: ${info.getCity()}</p>

        <pre>
            ${apiData}
        </pre>

        <p>city: <span id="cityName"></span></p>
        <pre id="cityData"></pre>

        <script>
            let city = 'Ljubljana';
            document.getElementById('cityName').innerHTML = city;
            fetch('https://restcountries.eu/rest/v2/capital/' + city)
                .then((response) => {
                return response.json();
            })
            .then((myJson) => {
                document.getElementById('cityData').innerHTML = JSON.stringify(myJson);
            });
        </script>
    </div>
</div>