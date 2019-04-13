# Notes

(C) 2019 [Damir Cavar], Umang Mehta, Aarushi Bisht, Jagpreet Chawla, [Oren Baldinger], ...

Java [JSON-NLP] Maven module and validator.

Brought to you by the [NLP-Lab.org].



## Deployment on OSSRH

See *pom.xml* for details on how to include the Nexus plugin.

There are two deployment configuration. If the deployed module-name ends in "-SNAPSHOT", it will be deployed under the snapshot URL. Else it will be deployed under the staging URL.

The credentials have to be set up in *.m2/settings.xml*:

    <servers>
        <server>
            <id>ossrh</id>
            <username>...</username>
            <password>...</password>
        </server>
    </servers>



## Package Name

Our domain name of the [NLP-Lab] is:

    nlp-lab.org

The package name is:

    org.nlp_lab.clauseboundaryms

The Java guidelines recommend:

    If the domain name contains a hyphen, or any other special character not allowed in an identifier (§3.8), convert it into an underscore.



[Damir Cavar]: http://damir.cavar.me/ "Damir Cavar"
[JSON-NLP]: https://github.com/dcavar/JSON-NLP "JSON-NLP GitHub repo"
[NLP-Lab]: https://nlp-lab.org/ "NLP-Lab homepage"
[Oren Baldinger]: https://oren.baldinger.me/ "Oren Baldinger"
[NLP-Lab.org]: http://nlp-lab.org/ "NLP-Lab.org"


