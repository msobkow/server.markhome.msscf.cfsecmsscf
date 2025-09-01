
// Description: Java 11 MssCF Binding for SecForm Column SecFormId.

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
 *	CFSecMssCFBindSecFormSecFormId binds SecForm.SecFormId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecFormSecFormId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecFormSecFormId() {
		super();
	}

	public CFSecMssCFBindSecFormSecFormId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecForm",
			"SecFormId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecFormSecFormId.getValueObject() ";

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

		int secFormId;
		if( genDef instanceof ICFSecSecFormObj ) {
			secFormId = ((ICFSecSecFormObj)genDef).getRequiredSecFormId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecFormObj" );
		}

		return( secFormId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecFormSecFormId.expandBody() ";

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
			int secFormId = ((ICFSecSecFormObj)genDef).getRequiredSecFormId();
			ret = Integer.toString( secFormId );
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
