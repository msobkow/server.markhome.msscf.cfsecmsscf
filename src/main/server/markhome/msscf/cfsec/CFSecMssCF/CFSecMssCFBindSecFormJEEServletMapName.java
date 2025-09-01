
// Description: Java 11 MssCF Binding for SecForm Column JEEServletMapName.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindSecFormJEEServletMapName binds SecForm.JEEServletMapName
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecFormJEEServletMapName
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecFormJEEServletMapName() {
		super();
	}

	public CFSecMssCFBindSecFormJEEServletMapName( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecForm",
			"JEEServletMapName" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecFormJEEServletMapName.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String jEEServletMapName;
		if( genDef instanceof ICFSecSecFormObj ) {
			jEEServletMapName = ((ICFSecSecFormObj)genDef).getRequiredJEEServletMapName();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecFormObj" );
		}

		return( jEEServletMapName );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecFormJEEServletMapName.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecSecFormObj ) {
			String jEEServletMapName = ((ICFSecSecFormObj)genDef).getRequiredJEEServletMapName();
			ret = jEEServletMapName;
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecFormObj" );
		}

		return( ret );
	}

}
